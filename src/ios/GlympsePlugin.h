#import <Cordova/CDV.h>
#import <GlympseKitLite/GlympseLite.h>

@interface GlympsePlugin : CDVPlugin

@property (assign) Glympse::GGlympseLite glympse;

- (void)start:(CDVInvokedUrlCommand*)command;

@end
