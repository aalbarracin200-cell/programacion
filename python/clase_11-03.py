class Estudiante:
    def __init__(self, nombre, nota):
        self.__nombre = nombre
        self.__nota=nota

class Estudiante:
    def get_nota(self):
        return self.__nota
    def set_nota(self, nueva_nota):
        if 0<=nueva_nota<=5:
            self_nota = nueva_nota
        else:
            print ("nota invalida")
            

obj = Estudiante ("alex", 4 )
print (obj.get_nota())
obj.set_nota(10)
print (obj.get_nota())