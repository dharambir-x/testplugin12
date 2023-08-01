import { WebPlugin } from '@capacitor/core';

import type { testpluginPlugin } from './definitions';

export class testpluginWeb extends WebPlugin implements testpluginPlugin {
  async getData(options:any): Promise<any> {
    console.log('ECHO', options);
    return options;
  }
  
async getReverse(filter: any): Promise<any> {
    console.log('filter: ', filter);
    return filter.split("").reverse().join("");;
  }
//reverseString("hello");
}
