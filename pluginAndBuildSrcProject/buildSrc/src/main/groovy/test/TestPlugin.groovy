package test

import org.gradle.api.Plugin
import org.gradle.api.plugins.PluginAware

class TestPlugin implements Plugin<PluginAware> {
    void apply(PluginAware pluginAware) {
        println "applied to $pluginAware"
    }
}

