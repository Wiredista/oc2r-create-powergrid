# OC2R: Create - Power Grid
This fork supports Create: Power Grid.  

Current supported devices are
- Voltage Gauge
- Current Gauge

There is a plan to support servo motors in the future.

Here's some sample code to interact with the devices.

```lua
-- Voltage gauge
local d = require("devices")
local gauge = d:find("voltage_gauge")

print( gauge:getVoltage() )
```

```lua
-- Current gauge
local d = require("devices")
local gauge = d:find("current_gauge")

print( gauge:getCurrent() )
```