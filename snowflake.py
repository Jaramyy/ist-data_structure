import turtle  
import math
def leaf_snowflake_draw(order = 0,size = 50):
    if order == 1:
        turtle.forward(size)
        turtle.forward(-1*size)
    else:
        turtle.forward(size)
        turtle.left(60)
        leaf_snowflake_draw(order-1,size/3)
        turtle.left(60)
        leaf_snowflake_draw(order-1,size/3)
        turtle.left(60)
        leaf_snowflake_draw(order-1,size/3)
        turtle.left(60)
        leaf_snowflake_draw(order-1,size/3)
        turtle.left(60)
        leaf_snowflake_draw(order-1,size/3)
        turtle.left(60)
        leaf_snowflake_draw(order-1,size/3)
        turtle.forward(-1*size)
        
def snow_flake(order,depth):
    if order == 0:
        return ""
    else:
        leaf_snowflake_draw(depth,200)
        turtle.left(60)
        snow_flake(order-1,depth)

screen = turtle.Screen()
turtle.speed(0)
turtle.pensize(1)
turtle.color('black')
turtle.penup()
turtle.goto(0,0)
turtle.pendown()
turtle.clear()
snow_flake(order = 6, depth = 4)
turtle.done() 