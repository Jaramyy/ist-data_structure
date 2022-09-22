import turtle  
import math
def draw_squre(size):
    for iter in range(4):
            turtle.forward(size)
            turtle.left(90)

def pythagorus_draw(order = 0,size = 50):
    if order == 1:
        draw_squre(size)
    else:
        draw_squre(size)
        turtle.left(90)
        turtle.forward(size)
        turtle.right(45)
        pythagorus_draw(order-1,((size/2)/(math.cos(math.radians((45))))))
        turtle.forward(((size/2)/(math.cos(math.radians(45)))))
        turtle.right(90)
        pythagorus_draw(order-1, ((size/2)/(math.cos(math.radians((45))))))
        turtle.left(90)
        turtle.forward(-1*((size/2)/(math.cos(math.radians(45)))))
        turtle.left(45)
        turtle.forward(-1*size)
        turtle.right(90)

screen = turtle.Screen()
turtle.speed(0)
turtle.pensize(2)
turtle.color('green')
turtle.penup()
turtle.goto(-30,-300)
turtle.pendown()
turtle.clear()

pythagorus_draw(order = 8 , size= 100)
turtle.done() 