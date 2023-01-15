/**
 * 
 */
package com.SIMRacingApps.SIMPlugins.Template;

import com.SIMRacingApps.Car;
import com.SIMRacingApps.SIMPlugin;

/**
 * @author Jeffrey Gilliam
 * @copyright Copyright (C) 2015 - 2023 Jeffrey Gilliam
 * @since 1.9
 * @license Apache License 2.0
 */
public class TemplateCar extends Car {

    private SIMPlugin m_SIMPlugin;
    /**
     * @param SIMPlugin
     */
    public TemplateCar(SIMPlugin SIMPlugin) {
        super(SIMPlugin);
        m_SIMPlugin = SIMPlugin;
        // TODO Auto-generated constructor stub
    }

    /**
     * @param SIMPlugin
     * @param id
     * @param name
     * @param carPath
     */
    public TemplateCar(SIMPlugin SIMPlugin, int id, String name,
            String carPath) {
        super(SIMPlugin, id, name, carPath);
        m_SIMPlugin = SIMPlugin;
        // TODO Auto-generated constructor stub
        //      Use the super class _setGauge() to populate the gauges
    }
}
