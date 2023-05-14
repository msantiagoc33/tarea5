/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fechas;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

/**
 *
 * @author Usuario
 */
public class Fechas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // imprimir  la fecha acutal
        LocalDate fechaActual = LocalDate.now();
        System.out.println("Fecha actual: "+fechaActual);
        
        // imprimir la fecha de dentro de una semana
        System.out.println("Fecha dentro de una semana: "+fechaActual.plusWeeks(1));
        
        // imprimir el numero de dias entre dos fecha
        LocalDate fechaNacimiento = LocalDate.of(1957, 6, 9);
        long dias = ChronoUnit.YEARS.between(fechaNacimiento,fechaActual);
        System.out.println("Años entre dos fechas: "+dias);
        
        // imprimir el mes de una fecha
        System.out.println("El mes de mi nacimiento es "+fechaNacimiento.getMonth());
        
        // dia de la semana de un a fecha
        System.out.println("el dia de semana de hoy es "+fechaActual.getDayOfWeek());
        
        // aumentar en tres meses la fecha actual
        System.out.println("La fecha dentro de 3 meses es "+fechaActual.plusMonths(3));
        
        // aumentar la fecha actual 1 año y 2 meses
        System.out.println("La fecha dentro de 1 año y 3 meses es "+fechaActual.plusYears(1).plusMonths(2));
        
        // fecha 10 dias antes de hoy
        System.out.println("Fecha 10 dias antes de la fecha actual: "+fechaActual.minusDays(10));

        // representa el primer dia del presente año
        System.out.println("El primer dia del presente año era "+fechaActual.withDayOfYear(1));
        
        // ultimo dia del presente mes
        System.out.println("El ultimo dia del presente mes es "+fechaActual.with(TemporalAdjusters.lastDayOfMonth()));
    }
    
}
