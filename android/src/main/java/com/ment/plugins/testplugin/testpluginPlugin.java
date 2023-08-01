package com.ment.plugins.testplugin;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "testplugin")
public class testpluginPlugin extends Plugin {
	/*
	getData(data:any): Promise<any>;
  getReverse(data:any): Promise<any>;
	*/
    private testplugin implementation = new testplugin();

    @PluginMethod
    public void getData(PluginCall call) {
        String value = call.getString("value");

        JSObject ret = new JSObject();
        ret.put("value", implementation.getData(value));
        call.resolve(ret);
    }
	
	@PluginMethod
    public void getReverse(PluginCall call) {
        String value = call.getString("value");

        JSObject ret = new JSObject();
        ret.put("value", implementation.getReverse(value));
        call.resolve(ret);
    }
}
