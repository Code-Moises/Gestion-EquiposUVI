import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Conductor>conductores = new ArrayList<>();
        conductores.add(new Conductor("Julia Ron", LocalDate.of(1990, 10, 10), "10000000J", LocalDate.of(2010, 10, 10), 15));
        conductores.add(new Conductor("Ana Ríos", LocalDate.of(1991, 1, 1), "11111111A", LocalDate.of(2011, 1, 1), 15));
        conductores.add(new Conductor("Blanca Maestre", LocalDate.of(1992, 2, 2), "22222222B", LocalDate.of(2012, 2, 2), 15));
        conductores.add(new Conductor("Clara Campo", LocalDate.of(1993, 3, 3), "33333333C", LocalDate.of(2013, 3, 3), 15));
        conductores.add(new Conductor("Diego Bas", LocalDate.of(1994, 4, 4), "44444444D", LocalDate.of(2014, 4, 4), 15));
        conductores.add(new Conductor("Ernesto Sevilla", LocalDate.of(1995, 5, 5), "55555555E", LocalDate.of(2015, 5, 5), 15));
        conductores.add(new Conductor("Fabiola Ultrich", LocalDate.of(1996, 6, 6), "66666666F", LocalDate.of(2016, 6, 6), 15));
        conductores.add(new Conductor("Galia Amat", LocalDate.of(1997, 7, 7), "77777777G", LocalDate.of(2017, 7, 7), 15));
        conductores.add(new Conductor("Helena García", LocalDate.of(1998, 8, 8), "88888888H", LocalDate.of(2018, 8, 8), 15));
        conductores.add(new Conductor("Isidro López", LocalDate.of(1999, 9, 9), "99999999I", LocalDate.of(2019, 9, 9), 15));
    
        ArrayList<Medico>medicos = new ArrayList<>();
        medicos.add(new Medico("Nuria Ros", "10000088N", LocalDate.of(1990, 10, 10), LocalDate.of(2010, 10, 10), "Traumatólogo", "10000"));
        medicos.add(new Medico("Ángela Blasco", "11111112A", LocalDate.of(1991, 1, 1), LocalDate.of(2011, 1, 1), "Traumatólogo", "11111"));
        medicos.add(new Medico("Pedro Campos", "22222223B", LocalDate.of(1992, 2, 2), LocalDate.of(2012, 2, 2), "Dermatólogo", "22222"));
        medicos.add(new Medico("Celia Cruz", "33333334C", LocalDate.of(1993, 3, 3), LocalDate.of(2013, 3, 3), "Cardiólogo", "33333"));
        medicos.add(new Medico("Dunia Amat", "44444445D", LocalDate.of(1994, 4, 4), LocalDate.of(2014, 4, 4), "Hematólogo", "44444"));
        medicos.add(new Medico("Esperanza", "55555556E", LocalDate.of(1995, 5, 5), LocalDate.of(2015, 5, 5), "Neurólogo", "55555"));
        medicos.add(new Medico("Fernando", "66666667F", LocalDate.of(1996, 6, 6), LocalDate.of(2016, 6, 6), "Neurólogo", "66666"));
        medicos.add(new Medico("Gerardo", "77777778G", LocalDate.of(1997, 7, 7), LocalDate.of(2017, 7, 7), "Neurólogo", "77777"));
        medicos.add(new Medico("Lidia Galvañ", "88888889H", LocalDate.of(1998, 8, 8), LocalDate.of(2018, 8, 8), "Cardiólogo", "88888"));
        medicos.add(new Medico("Mario Vaquero", "99999910I", LocalDate.of(1999, 9, 9), LocalDate.of(2019, 9, 9), "Pediatra", "99999"));

        ArrayList<Enfermero>enfermeros = new ArrayList<>();
        enfermeros.add(new Enfermero("Triana Garcia", LocalDate.of(1990, 10, 10), "10000888T", "Geriátrica", "Francés"));
        enfermeros.add(new Enfermero("Antonio Martín", LocalDate.of(1991, 1, 1), "11111116A", "Pediátrica", "Alemán"));
        enfermeros.add(new Enfermero("Paula Jiménez", LocalDate.of(1992, 2, 2), "22222227B", "Obstétrico-ginecológica"));
        enfermeros.add(new Enfermero("Sonia Guevara", LocalDate.of(1993, 3, 3), "33333338C", "Salud Mental", "Ruso"));
        enfermeros.add(new Enfermero("Belén Sánchez", LocalDate.of(1994, 4, 4), "44444449D", "Familiar y Comunitaria"));
        enfermeros.add(new Enfermero("Esteban Torres", LocalDate.of(1995, 5, 5), "55555550E"));
        enfermeros.add(new Enfermero("Francisco Santos", LocalDate.of(1996, 6, 6), "66666661F"));
        enfermeros.add(new Enfermero("Gimena Hernando", LocalDate.of(1997, 7, 7), "77777772G"));
        enfermeros.add(new Enfermero("Leopoldo Clarín", LocalDate.of(1998, 8, 8), "88888883H"));
        enfermeros.add(new Enfermero("María Teruel", LocalDate.of(1999, 9, 9), "99999994I"));

        ArrayList<EquipoUvi>equipos = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
        //seleccionamos el objeto aleatoriamente y eliminandolo para que no se pueda repetir
            Conductor c1 = conductores.remove(random.nextInt(conductores.size()));
            Enfermero e1 = enfermeros.remove(random.nextInt(enfermeros.size()));
            Medico m1 = medicos.remove(random.nextInt(medicos.size()));

            //Asignación del equipo a un turno
            String turno = "";
            String matricula = "";
            switch (i) {
                case 0: 
                    turno = "mañana";
                    matricula = "JFX - 2345";
                    break;
                case 1: 
                    turno = "mañana";
                    matricula = "OOP - 0000";
                    break;
                case 2: 
                    turno = "mañana";
                    matricula = "SSK - 9382";
                    break;
            }
            equipos.add(new EquipoUvi(c1, e1, m1, matricula, LocalDate.of(random.nextInt(1900, 2025), random.nextInt(1, 12), random.nextInt(1, 28)), turno));
        }

        for (EquipoUvi equipitos : equipos) {
            System.out.println(equipitos);
            System.out.println("-----------------------------");
        }

        Paciente p1 = new Paciente("Manolo", LocalDate.of(1997, 7, 7), "12345678X", "No se, en verdad solo le dolia la cabeza", "Reposar un ratillo");
        equipos.get(0).tratar(p1);
    }
}
