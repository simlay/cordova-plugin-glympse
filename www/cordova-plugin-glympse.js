var exec = require('cordova/exec');

module.exports = {

  start: function(arg0, success, error) {
    exec(success, error, "cordova-plugin-glympse", "start", [arg0]);
  }
};
