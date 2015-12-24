#import "GlympsePlugin.h"
#include <string>

using namespace std;


@implementation GlympsePlugin


- (void)pluginInitialize
{
    NSString *APIKey = [[[NSBundle mainBundle] infoDictionary] objectForKey:@"Glympse API Key"];
    NSString *serverURL = [[[NSBundle mainBundle] infoDictionary] objectForKey:@"Glympse Server URL"];
    NSLog(APIKey);
    NSLog(serverURL);
    // _glympse = Glympse::LiteFactory::createGlympse(Glympse::GString(APIKey), Glympse::GString(serverURL));
    // _glympse = Glympse::LiteFactory::createGlympse(
    //     Glympse::GString(new string([APIKey UTF8String])),
    //     Glympse::GString(new string([serverURL UTF8String]))
    // );
}
- (void)start:(CDVInvokedUrlCommand*)command
{
    _glympse->start();
    CDVPluginResult* pluginResult = nil;
    [self.commandDelegate sendPluginResult:pluginResult callbackId:command.callbackId];
}

@end
