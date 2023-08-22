import matplotlib.pyplot as plt
import numpy as np


x = np.linspace(-1, 30000)

a = np.linspace(1, 1, len(x))
b = x
c = x**2
# d = 2**x
e = 200 * np.log2(x)

# plt.plot(x, a, label="1")
plt.plot(x, b, label="x")
# plt.plot(x, c, label="x^2")
# plt.plot(x, d, label="2^x")
plt.plot(x, e, label="log2(x)")
plt.grid(True)
plt.legend(loc="upper left")
plt.ylabel('y')
plt.ylabel('x')
plt.show()