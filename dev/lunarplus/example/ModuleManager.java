
public void startup() {
    for(File file : new File(scriptsDir).listFiles()) {
	modules.add(new ScriptModule(file.getName()));
    }
}