package lunar.plus.script;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.function.Function;

import javax.script.Invocable;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.script.SimpleScriptContext;

import org.jetbrains.annotations.NotNull;
import org.lwjgl.input.Keyboard;

import lunar.plus.Client;
import lunar.plus.events.Event;
import lunar.plus.events.listeners.EventAtack;
import lunar.plus.events.listeners.EventBow;
import lunar.plus.events.listeners.EventChat;
import lunar.plus.events.listeners.EventDamage;
import lunar.plus.events.listeners.EventJump;
import lunar.plus.events.listeners.EventKey;
import lunar.plus.events.listeners.EventMotion;
import lunar.plus.events.listeners.EventPacket;
import lunar.plus.events.listeners.EventRender2D;
import lunar.plus.events.listeners.EventRender3D;
import lunar.plus.events.listeners.EventShutDown;
import lunar.plus.events.listeners.EventStrafe;
import lunar.plus.events.listeners.EventUpdate;
import lunar.plus.modules.Module;
import lunar.plus.modules.Module.Category;
import net.minecraft.client.Minecraft;

public class ScriptModule extends Module {
	
	public ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
	public String scriptName;
	public Invocable invocable = (Invocable) engine;

	public ScriptModule(String scriptName) {
		super("ScriptModule", 0, null);
		this.scriptName = scriptName;
		try {
			engine.eval(new FileReader(Client.scriptsDir + scriptName));
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.category = Client.getCategoryByName(getCategory());
		this.name = getName();
		// Instances
		engine.put("mc", Minecraft.getMinecraft());
	}
	
	@Override
	public void onEnable() {
		boolean doesExist = true;
		try {
			if(doesExist) {
				Object onEnable = invocable.invokeFunction("onEnable");
			}
		} catch (NoSuchMethodException e) {
			doesExist = false;
		} catch (ScriptException e) {
			Client.addChatMessage("Error: " + e);
		}
	}
	
	@Override
	public void onDisable() {
		boolean doesExist = true;
		try {
			if(doesExist) {
				Object onEnable = invocable.invokeFunction("onDisable");
			}
		} catch (NoSuchMethodException e) {
			doesExist = false;
		} catch (ScriptException e) {
			Client.addChatMessage("Error: " + e);
		}
	}
	
	public String getName() {
		boolean doesExist = true;
		Object getName = null;
		try {
			if(doesExist) {
				getName = invocable.invokeFunction("getName");
			}
		} catch (NoSuchMethodException e) {
			doesExist = false;
		} catch (ScriptException e) {
			Client.addChatMessage("Error: " + e);
		}
		return (String) getName;
	}
	
	public String getCategory() {
		boolean doesExist = true;
		Object getCategory = null;
		try {
			if(doesExist) {
				getCategory = invocable.invokeFunction("getCategory");
			}
		} catch (NoSuchMethodException e) {
			doesExist = false;
		} catch (ScriptException e) {
			Client.addChatMessage("Error: " + e);
		}
		return (String) getCategory;
	}
	
	@Override
	public void onAttack(EventAtack event) {
		boolean doesExist = true;
		try {
			if(doesExist) {
				Object onAttack = invocable.invokeFunction("onAttack");
			}
		} catch (NoSuchMethodException e) {
			doesExist = false;
		} catch (ScriptException e) {
			Client.addChatMessage("Error: " + e);
		}
	}
	
	@Override
	public void onBow(EventBow event) {
		boolean doesExist = true;
		try {
			if(doesExist) {
				Object onBow = invocable.invokeFunction("onBow");
			}
		} catch (NoSuchMethodException e) {
			doesExist = false;
		} catch (ScriptException e) {
			Client.addChatMessage("Error: " + e);
		}
	}
	
	@Override
	public void onChat(EventChat event) {
		boolean doesExist = true;
		try {
			if(doesExist) {
				Object onChat = invocable.invokeFunction("onChat");
			}
		} catch (NoSuchMethodException e) {
			doesExist = false;
		} catch (ScriptException e) {
			Client.addChatMessage("Error: " + e);
		}
	}
	
	@Override
	public void onDamage(EventDamage event) {
		boolean doesExist = true;
		try {
			if(doesExist) {
				Object onDamage = invocable.invokeFunction("onDamage");
			}
		} catch (NoSuchMethodException e) {
			doesExist = false;
		} catch (ScriptException e) {
			Client.addChatMessage("Error: " + e);
		}
	}
	
	@Override
	public void onJump(EventJump event) {
		boolean doesExist = true;
		try {
			if(doesExist) {
				Object onDamage = invocable.invokeFunction("onDamage");
			}
		} catch (NoSuchMethodException e) {
			doesExist = false;
		} catch (ScriptException e) {
			Client.addChatMessage("Error: " + e);
		}
	}
	
	@Override
	public void onKey(EventKey event) {
		boolean doesExist = true;
		try {
			if(doesExist) {
				Object onKey = invocable.invokeFunction("onKey");
			}
		} catch (NoSuchMethodException e) {
			doesExist = false;
		} catch (ScriptException e) {
			Client.addChatMessage("Error: " + e);
		}
	}
	
	@Override
	public void onMotion(EventMotion event) {
		boolean doesExist = true;
		try {
			if(doesExist) {
				Object onMotion = invocable.invokeFunction("onMotion");
			}
		} catch (NoSuchMethodException e) {
			doesExist = false;
		} catch (ScriptException e) {
			Client.addChatMessage("Error: " + e);
		}
	}
	
    @Override
    public void onPacket(EventPacket event) {
    	boolean doesExist = true;
		try {
			if(doesExist) {
				Object onPacket = invocable.invokeFunction("onPacket");
			}
		} catch (NoSuchMethodException e) {
			doesExist = false;
		} catch (ScriptException e) {
			Client.addChatMessage("Error: " + e);
		}
    }
    
    @Override
    public void onRender2D(EventRender2D event) {
    	boolean doesExist = true;
		try {
			if(doesExist) {
				Object onRender2D = invocable.invokeFunction("onRender2D");
			}
		} catch (NoSuchMethodException e) {
			doesExist = false;
		} catch (ScriptException e) {
			Client.addChatMessage("Error: " + e);
		}
    }
    
    @Override
    public void onRender3D(EventRender3D event) {
    	boolean doesExist = true;
		try {
			if(doesExist) {
				Object onRender3D = invocable.invokeFunction("onRender3D");
			}
		} catch (NoSuchMethodException e) {
			doesExist = false;
		} catch (ScriptException e) {
			Client.addChatMessage("Error: " + e);
		}
    }
    
    @Override
    public void onShutdown(EventShutDown event) {
    	boolean doesExist = true;
		try {
			if(doesExist) {
				Object onShutdown = invocable.invokeFunction("onShutdown");
			}
		} catch (NoSuchMethodException e) {
			doesExist = false;
		} catch (ScriptException e) {
			Client.addChatMessage("Error: " + e);
		}
    }
    
    @Override
    public void onStrafe(EventStrafe event) {
    	boolean doesExist = true;
		try {
			if(doesExist) {
				Object onStrafe = invocable.invokeFunction("onStrafe");
			}
		} catch (NoSuchMethodException e) {
			doesExist = false;
		} catch (ScriptException e) {
			Client.addChatMessage("Error: " + e);
		}
    }
    
    @Override
    public void onUpdate(EventUpdate event) {
    	boolean doesExist = true;
		try {
			if(doesExist) {
				Object onUpdate = invocable.invokeFunction("onUpdate");
			}
		} catch (NoSuchMethodException e) {
			doesExist = false;
		} catch (ScriptException e) {
			Client.addChatMessage("Error: " + e);
		}
    }
}
