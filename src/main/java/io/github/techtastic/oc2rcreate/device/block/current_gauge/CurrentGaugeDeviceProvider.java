package io.github.techtastic.oc2rcreate.device.block.current_gauge;

import com.simibubi.create.AllBlockEntityTypes;
import com.simibubi.create.content.kinetics.gauge.SpeedGaugeBlockEntity;
import li.cil.oc2.api.bus.device.Device;
import li.cil.oc2.api.bus.device.provider.BlockDeviceQuery;
import li.cil.oc2.api.util.Invalidatable;
import li.cil.oc2.common.bus.device.provider.util.AbstractBlockEntityDeviceProvider;
import org.jetbrains.annotations.NotNull;
import org.patryk3211.powergrid.collections.ModdedBlockEntities;
import org.patryk3211.powergrid.collections.ModdedBlocks;
import org.patryk3211.powergrid.electricity.gauge.CurrentGaugeBlockEntity;
import org.patryk3211.powergrid.electricity.gauge.VoltageGaugeBlockEntity;

public class CurrentGaugeDeviceProvider extends AbstractBlockEntityDeviceProvider<CurrentGaugeBlockEntity> {
    public CurrentGaugeDeviceProvider() {
        super(ModdedBlockEntities.CURRENT_METER.get());
    }

    @Override
    protected @NotNull Invalidatable<Device> getBlockDevice(@NotNull BlockDeviceQuery query, @NotNull CurrentGaugeBlockEntity gauge) {
        return Invalidatable.of(new CurrentGaugeDevice(gauge));
    }
}
