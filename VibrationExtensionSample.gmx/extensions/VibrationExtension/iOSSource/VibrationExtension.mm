#import "VibrationExtension.h"

@implementation VibrationExtension

- (double) vibrate
{
    AudioServicesPlaySystemSound(kSystemSoundID_Vibrate);

    return (double)-1;
}

@end
