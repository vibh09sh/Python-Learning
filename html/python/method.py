from turtle import *
import colorsys

speed(0)
bgcolor("black")
pensize(2)
h = 0.5

for i in range(200):
    c = colorsys.hsv_to_rgb(h, 1, 1)
    color(c)
    h += 0.005
    rt(10)

    for i in range(5):
        fd(i * 10)
        rt(20 * 5)
    rt(120)

done()
