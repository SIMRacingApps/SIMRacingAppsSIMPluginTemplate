/**
 * 
 */
package com.SIMRacingApps.SIMPlugins.Template;

import java.util.Map;

import com.SIMRacingApps.Car;
import com.SIMRacingApps.Data;
import com.SIMRacingApps.Gauge;
import com.SIMRacingApps.Track;
import com.SIMRacingApps.Util.State;

/**
 * @author Jeffrey Gilliam
 * @copyright Copyright (C) 2015 - 2023 Jeffrey Gilliam
 * @since 1.5
 * @license Apache License 2.0
 */
public class TemplateGauge extends Gauge {

    /**
     * This class can be used as a base class for all your gauges,
     * or you can write all the code to return the values in here.
     * This will be the most difficult part of the implementation process.
     * The TemplateCar class must instantiate each of the gauges using this class or subclass.
     * @param type
     * @param car
     * @param track
     * @param simGaugesBefore
     * @param simGaugesAfter
     */
    public TemplateGauge(String type, Car car, Track track,
            Map<String, Map<String, Map<String, Object>>> simGaugesBefore,
            Map<String, Map<String, Map<String, Object>>> simGaugesAfter) {
        super(type, car, track, simGaugesBefore, simGaugesAfter);
        // TODO Auto-generated constructor stub
    }

    public Data getValueCurrent(String UOM,String gear,String power) { 
        Data d = super.getValueCurrent(UOM);
        //TODO: Implement your gauge reading logic
        return _getReturnValue(d,UOM,gear,power);
    }
    
    @Override
    public Data getValueCurrent(String UOM) { 
        Data d = super.getValueCurrent(UOM);
        //TODO: Implement your gauge reading logic
        return _getReturnValue(d,UOM);
    }
    
    @Override
    public Data getLaps() {
        //TODO: return the number of laps run (i.e. the current lap)
        return super.getLaps();
    }
    
}
