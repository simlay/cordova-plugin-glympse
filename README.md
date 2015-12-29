# Glympse Cordova Plugin

A cordova plugin for the Glympse Lite SDK!

## Installation
    cordova plugin add https://github.com/simlay/cordova-plugin-glympse

## Issues

Doesn't link correctly with some of Glympse Lite SDK. `Glympse::Core` in iOS
seems to be missing and `LiteFactory.createGlympse` produces a runtime error.

## Quirks

The iOS SDK is sorta large so it's not in git tracking. Download it and put the
`GlympseKitLite.framework` in `lib/ios`
