#Ejemplo de una funcion trigonometrica
import math
import matplotlib.pyplot as plt

#Dominio entre 0 y 2PI
dom=0
x=[]
y=[]
z=[]
while dom<=7:
	x.append(dom)
	y.append(math.sin(dom))
	z.append(math.cos(dom))
	dom+=0.1

plt.plot(x,y)
plt.plot(x,z)
plt.grid()
plt.title('Graficas de Funciones Trigo')
plt.xlabel('Eje de las X')
plt.ylabel('Eje de las Y')
plt.show()


