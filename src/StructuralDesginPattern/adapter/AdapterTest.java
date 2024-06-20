package StructuralDesginPattern.adapter;

public class AdapterTest {
    public static void main(String[] args) {

        SocketVoltageAdapterImpl adapter = new SocketVoltageAdapterImpl();

        adapter.get3VoltFromSocket().getVoltageReading();
        adapter.get120VoltFromSocket().getVoltageReading();
        adapter.get60VoltFromSocket().getVoltageReading();
    }
}
