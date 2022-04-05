import argparse


parser = argparse.ArgumentParser(description='ADD OR SUB TWO INTEGERS')
parser.add_argument('integers', metavar='N', type=int, nargs='+',
                    help='INTEGER')

parser.add_argument('--sub', dest='accumulate', action='store_const',
                    const=sum, default=max,
                    help='sub the integers (default: find the max)')

args = parser.parse_args()
args = args.__dict__
integers = args["integers"]

sum = 0
for element in integers:
    sum += element

print(sum)
