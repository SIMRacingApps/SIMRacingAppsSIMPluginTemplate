/**
 * 
 */
package com.SIMRacingApps.SIMPlugins.Template;

import com.SIMRacingApps.Car;
import com.SIMRacingApps.SIMPlugin;
import com.SIMRacingApps.Session;
import com.SIMRacingApps.Track;

/**
 * @author Jeffrey Gilliam
 * @copyright Copyright (C) 2015 - 2023 Jeffrey Gilliam
 * @since 1.5
 * @license Apache License 2.0
 */
public class TemplateSession extends Session {

    TemplateSIMPlugin m_SIMPlugin;
    /**
     * @param SIMPlugin
     */
    public TemplateSession(SIMPlugin SIMPlugin) {
        super(SIMPlugin);
        m_SIMPlugin = (TemplateSIMPlugin) SIMPlugin;
        // TODO Auto-generated constructor stub
    }

    @Override
    public Car getCar(String carIdentifier) {
        //TODO: add logic to create a car based on the carIdendifiers. See iRacingCar for an example.
        //      remove the call to super();
        Car car = super.getCar(carIdentifier);
        return car;
    }
    
    @Override
    public Track getTrack() {
        //TODO: add logic to create a track based on what the SIM is running.
        //      most tracks can be handled by the super class. Just need to provide the name
        //      remove the call to super();
        Track track = super.getTrack();
        return track;
    }
}
