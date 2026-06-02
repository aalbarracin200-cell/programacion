#una empresa deseaanalizar las ventas de 5 vendedores

#el programa debe:
#solicitar ventas, calcular promedio, indicar la venta mas alta
# y contar cuantas ventas fueron superiores a 1.000.000

# sin embargo el codigo tiene errores de logica
#por lo cual deve :
#identificar, corregir y hacer que funcione correctamente

total = 0
mayor = 0
contador = 0

for i in range (5):

    venta = int(input("Ingrese venta (sin puntos ni comas):"))# un posible error que podria pasar seria que el usuaria ingrese la venta con caracteres como "." o ","
    total = total + venta                # por lo que este error se arreglaria especificando el no usar estos aracteres


    if venta > mayor:
        mayor = venta # error ya que el operador de asignacion es de un solo sugno (=)
                       # no de comparacion (==) por lo cual el programa no asigna el valor de venta a mayor sino que lo compara 


    if venta > 1000000: # error ya que el numero 1000000 tiene comillas por esto 
                          # el programa no lo reconoce como numero sino como strig
        contador += 1 


promedio = total / 5 

print ("promedio", promedio)
print ("mayor", mayor)
print ("cantidades mayores al millon", contador)