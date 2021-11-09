OBJS	= myhw0.o
SOURCE	= myhw0.cpp
HEADER	= 
OUT	= myhw0
CC	 = g++
FLAGS	 = -g -c -Wall
LFLAGS	 = 

all: $(OBJS)
	$(CC) -g $(OBJS) -o $(OUT) $(LFLAGS)

myhw0.o: myhw0.cpp
	$(CC) $(FLAGS) myhw0.cpp 


clean:
	rm -f $(OBJS) $(OUT)
