var getName = function() {
    return "Works";
}
var getCategory = function() {
    return "OTHER";
}
var onEnable = function() {
    
}
var onDisable = function() {
    mc.timer.timerSpeed = 1;
}
var onUpdate = function() {
    mc.timer.timerSpeed = 0.5;
}