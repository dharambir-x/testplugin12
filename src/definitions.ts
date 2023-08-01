export interface testpluginPlugin {
  getData(data:any): Promise<any>;
  getReverse(data:any): Promise<any>;
}

