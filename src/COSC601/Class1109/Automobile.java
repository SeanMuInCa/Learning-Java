package COSC601.Class1109;

import java.util.Objects;

public class Automobile
{
    private double speed;
    private double odometer;
    private double fuel;

    public Automobile()
    {
        this(0,0,0);
    }

    public Automobile(double speed, double odometer, double fuel)
    {
        setFuel(fuel);
        setOdometer(odometer);
        setSpeed(speed);
    }

    public double getSpeed()
    {
        return speed;
    }

    public void setSpeed(double speed)
    {
        this.speed = speed > 0 ? speed : 0;
    }

    public double getOdometer()
    {
        return odometer;
    }

    public void setOdometer(double odometer)
    {
        this.odometer = odometer > 0 ? odometer : 0;
    }

    public double getFuel()
    {
        return fuel;
    }

    public void setFuel(double fuel)
    {
        this.fuel = fuel > 0 ? fuel : 0;
    }

    @Override
    public String toString()
    {
        return "Automobile{" +
                "speed=" + speed +
                ", odometer=" + odometer +
                ", fuel=" + fuel +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Automobile that = (Automobile) o;
        return Double.compare(speed, that.speed) == 0 && Double.compare(odometer, that.odometer) == 0 && Double.compare(fuel, that.fuel) == 0;
    }
    public void addOdometer(double val){
        setOdometer(this.odometer + val);
    }
}
