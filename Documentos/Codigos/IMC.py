#17/03/2026
print("Bienvenido a la calculadora de indice de masa corporal \n Desea conocer su IMC")
var_A="Y"
var_B="N"
input()
while "Y":
    print("Por favor ingresa tu peso y altura")
    Altura=int(input(""))
    Peso=int(input(""))
    IMC= Altura*Altura/Peso
    op_1= Altura*Altura/Peso
    print("Tu indice de masa corporal es", IMC)

    if IMC <= 18:print("Peso inferio al normal")
    elif IMC ==19:print("Peso normal")
    elif IMC >= 30:print("Usted tiene obesidad")
    print("Hasta pronto")
    break

    
