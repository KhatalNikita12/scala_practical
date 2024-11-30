import random
greeting=['hi','hey','hello']
random_greeting=random.choice(greeting)
question=['How Are You?','What Are you doing?']
answer=['I am fine','okay']
random_ans=random.choice(answer)
while True:
    userinput=input(">>>")
    if userinput in greeting:
        print(random_greeting)
    elif userinput in question:
        print(random_ans)
    elif userinput=="Bye":
        break
    else:
        print("I can't understand what are you saying")