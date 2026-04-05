package io.github.techtastic.oc2rcreate.device.block.voltage_gauge;

import org.patryk3211.powergrid.electricity.gauge.VoltageGaugeBlockEntity;
import io.github.techtastic.oc2rcreate.device.block.AbstractBlockRPCDevice;
import li.cil.oc2.api.bus.device.object.Callback;
import li.cil.oc2.api.bus.device.object.DocumentedDevice;
import org.jetbrains.annotations.NotNull;

public class VoltageGaugeDevice extends AbstractBlockRPCDevice implements DocumentedDevice {
    private final VoltageGaugeBlockEntity gauge;

    public VoltageGaugeDevice(VoltageGaugeBlockEntity gauge) {
        super("voltage_gauge");
        this.gauge = gauge;
    }

    @Callback
    public final float getVoltage() {
        return this.gauge.getValue();
    }

    @Override
    public void getDeviceDocumentation(@NotNull DeviceVisitor deviceVisitor) {
        deviceVisitor.visitCallback("getVoltage")
                .description("Gets the current voltage");
    }
}
