from services import SERVICE_LIST
import yaml

yaml.emitter.Emitter.process_tag = lambda self, *args, **kw: None

if __name__ == '__main__':
    print(yaml.dump(dict(services={
        key: {
            'port': SERVICE_LIST[key].port,
            'frequency': SERVICE_LIST[key].frequency,
            'should_log': SERVICE_LIST[key].should_log
            } for key in SERVICE_LIST})))