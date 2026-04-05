package io.github.techtastic.oc2rcreate.device.block.current_gauge;

import io.github.techtastic.oc2rcreate.device.block.AbstractBlockRPCDevice;
import li.cil.oc2.api.bus.device.object.Callback;
import li.cil.oc2.api.bus.device.object.DocumentedDevice;
import org.jetbrains.annotations.NotNull;
import org.patryk3211.powergrid.electricity.gauge.CurrentGaugeBlockEntity;
import org.patryk3211.powergrid.electricity.gauge.VoltageGaugeBlockEntity;

public class CurrentGaugeDevice extends AbstractBlockRPCDevice implements DocumentedDevice {
    private final CurrentGaugeBlockEntity gauge;

    public CurrentGaugeDevice(CurrentGaugeBlockEntity gauge) {
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
