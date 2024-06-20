package StructuralDesginPattern.adapter;

public class ElectricSocket {

    public Voltage fetchVoltage() {
        return new Voltage(240);
    }


}
