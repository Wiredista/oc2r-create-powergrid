package io.github.techtastic.oc2rcreate.device.block.voltage_gauge;

import com.simibubi.create.AllBlockEntityTypes;
import li.cil.oc2.api.bus.device.Device;
import li.cil.oc2.api.bus.device.provider.BlockDeviceQuery;
import li.cil.oc2.api.util.Invalidatable;
import li.cil.oc2.common.bus.device.provider.util.AbstractBlockEntityDeviceProvider;
import org.jetbrains.annotations.NotNull;
import org.patryk3211.powergrid.collections.ModdedBlockEntities;
import org.patryk3211.powergrid.collections.ModdedBlocks;
import org.patryk3211.powergrid.electricity.gauge.VoltageGaugeBlockEntity;

public class VoltageGaugeDeviceProvider extends AbstractBlockEntityDeviceProvider<VoltageGaugeBlockEntity> {
    public VoltageGaugeDeviceProvider() {
        super(ModdedBlockEntities.VOLTAGE_METER.get());
    }

    @Override
    protected @NotNull Invalidatable<Device> getBlockDevice(@NotNull BlockDeviceQuery query, @NotNull VoltageGaugeBlockEntity gauge) {
        return Invalidatable.of(new VoltageGaugeDevice(gauge));
    }
}
