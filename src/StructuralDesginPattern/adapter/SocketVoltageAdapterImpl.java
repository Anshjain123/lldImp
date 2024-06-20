package StructuralDesginPattern.adapter;

public class SocketVoltageAdapterImpl extends ElectricSocket implements SocketVoltageAdapter{

    @Override
    public Voltage get120VoltFromSocket() {
        Voltage voltage = fetchVoltage();
        voltage.setVoltageReading(voltage.getVoltageReading()/2);
        return voltage;
    }

    @Override
    public Voltage get240VoltFromSocket() {
        return fetchVoltage();
    }

    @Override
    public Voltage get60VoltFromSocket() {
        Voltage voltage = fetchVoltage();
        voltage.setVoltageReading(voltage.getVoltageReading()/6);
        return voltage;
    }

    @Override
    public Voltage get3VoltFromSocket() {
        Voltage voltage = fetchVoltage();
        voltage.setVoltageReading(voltage.getVoltageReading()/8);
        return voltage;
    }
}
