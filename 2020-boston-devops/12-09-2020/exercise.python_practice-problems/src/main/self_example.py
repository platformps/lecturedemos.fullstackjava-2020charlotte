class SelfExample(object):

    def __init__(self, s):
        self.s = s

    def perform_behavior(self):
        t = s
        print(t)


SelfExample("Hello world").perform_behavior()