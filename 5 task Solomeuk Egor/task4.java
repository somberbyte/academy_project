N = int(input("Введите количество минут: "));
minutes_day = N % 1440;
hours = minutes_day / 60;

print(f"{hours:02d}:{minutes:02d}");