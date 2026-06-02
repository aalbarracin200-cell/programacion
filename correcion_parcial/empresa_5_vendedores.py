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

    venta = int(input("Ingrese venta:"))
    total = total + venta 

    if venta >= mayor:
        mayor == venta


    if venta > "1000000":
        contador += 1 


promedio = total / 5 

print ("promedio", promedio)
print ("mayor", mayor)
print ("cantidades mayores al millon", contador)