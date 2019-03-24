/**
 * 
 */
package com.SIMRacingApps.SIMPlugins.Template;

import com.SIMRacingApps.SIMPlugin;
import com.SIMRacingApps.Server;
import com.SIMRacingApps.Session;

/**
 * @author Jeffrey Gilliam
 * @copyright Copyright (C) 2015 - 2019 Jeffrey Gilliam
 * @since 1.0
 * @license Apache License 2.0
 */
public class TemplateSIMPlugin extends SIMPlugin {

    TemplateSession m_session = null;
    /**
     * @throws SIMPluginException
     */
    public TemplateSIMPlugin() throws SIMPluginException {
        Server.logger().info("TemplateSIMPluging created");
        m_session = new TemplateSession(this);
    }

    @Override
    public Session getSession() {
        return m_session;
    }
    
    /*
     *This 3 methods get called by the plugin. Add your own code for the SIM you are implementing. 
     */
    @Override
    public boolean isActive()               { return super.isActive(); }
    @Override
    public boolean waitForDataReady()       { return super.waitForDataReady(); }
    @Override
    public boolean isConnected()            { return super.isConnected(); }
}
