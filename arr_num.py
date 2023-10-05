#funcion con numpy
import matplotlib.pyplot as plt
import numpy as np
import math

x=np.arange(-5,5,0.1)
y=np.sin(x)
z=np.cos(x)
plt.plot(x,y,label='Sin x')
plt.plot(x,z, label='Cos x')
plt.grid()
plt.title('Graficas de Funciones Trigo')
plt.xlabel('Eje de las X')
plt.ylabel('Eje de las Y')
plt.legend()
plt.show()