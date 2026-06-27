from abc import ABC,abstractmethod

# create Product

class Localizer(ABC):
    @abstractmethod
    def localize(self,msg):
        pass

class FrenchLocalizer(Localizer):
    def __init__(self):
        self.translations = {
          "car": "voiture",
          "bike": "bicyclette",
          "cycle": "cyclette"
        }

    def localize(self, msg):
        """Translate the message to French."""
        return self.translations.get(msg, msg)

class SpanishLocalizer(Localizer):
    def __init__(self):
        self.translations = {
          "car": "coche",
          "bike": "bicicleta",
          "cycle": "ciclo"
        }
    
    def localize(self, msg):
        return self.translations.get(msg)


class LocalizerFactory(ABC):
    @abstractmethod
    def create_localizer(self):
        pass

class FrenchLocalizerFactory(LocalizerFactory):

    def create_localizer(self):
        return FrenchLocalizer()

class SpanishLocalizerFactory(LocalizerFactory):

    def create_localizer(self):
        return SpanishLocalizer()


french=FrenchLocalizerFactory()
spanish=SpanishLocalizerFactory()
french_local=french.create_localizer()
print(french_local.localize("car"))
print(spanish.create_localizer().localize("bike"))