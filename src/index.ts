import { registerPlugin } from '@capacitor/core';

import type { testpluginPlugin } from './definitions';

const testplugin = registerPlugin<testpluginPlugin>('testplugin', {
  web: () => import('./web').then(m => new m.testpluginWeb()),
});

export * from './definitions';
export { testplugin };
