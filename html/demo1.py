import turtle

t = turtle.Turtle()
turtle.Screen().bgcolor("black")
t.pensize(2)
t.speed(0)
for i in range(40):
    t.color("blue")
    for i in range(4):
        t.circle(40 + i * 4, -90)
        t.forward(200)
        t.right(90)
    t.left(10)
turtle.done()
