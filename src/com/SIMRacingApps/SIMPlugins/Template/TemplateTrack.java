/**
 * 
 */
package com.SIMRacingApps.SIMPlugins.Template;

import com.SIMRacingApps.Data;
import com.SIMRacingApps.Track;

/**
 * @author Jeffrey Gilliam
 * @copyright Copyright (C) 2019 - 2019 Jeffrey Gilliam
 * @since 1.9
 * @license Apache License 2.0
 */
public class TemplateTrack extends Track {

    private com.SIMRacingApps.SIMPlugin m_SIMPlugin;
    /**
     * @param SIMPlugin
     */
    public TemplateTrack(com.SIMRacingApps.SIMPlugin SIMPlugin) {
        super(SIMPlugin);
        m_SIMPlugin = SIMPlugin;
        // TODO Auto-generated constructor stub
    }

    @Override
    public Data getName() {
        Data name = super.getName();
        //TODO: ask the SIM what the name of the track is and return it.
        //      all track profiles are maintained by the main class
        return name;
    }
}
