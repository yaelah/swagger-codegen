#import <Foundation/Foundation.h>
#import "SWGObject.h"
#import "SwaggerClient.SWGTag.h"
#import "SwaggerClient.SWGCategory.h"


@protocol SWGPet
@end
  
@interface SWGPet : SWGObject


@property(nonatomic) NSNumber* _id;

@property(nonatomic) SWGCategory* category;

@property(nonatomic) NSString* name;

@property(nonatomic) NSArray* photoUrls;

@property(nonatomic) NSArray<SWGTag>* tags;
/* pet status in the store [optional]
 */
@property(nonatomic) NSString* status;

@end
