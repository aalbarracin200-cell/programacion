class Persona:
    def __init__(self,nombre):
        self,nombre=nombre

class Estudiante(Persona):
        def __init__ (self,nombre,carrera):
             super().__init__(nombre)
             self.carrera=carrera
        