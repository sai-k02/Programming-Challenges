# Created by Srilokh Karuturi
# Code will rotate given matrix
# Column to rows

def updateRows(columnToRows, matrix, itr):
    # find which row to work
    rowToWorkWith = (len(columnToRows)-1)-itr
    columnToRows[rowToWorkWith] = matrix
        

# to rotate the matrix, all we need to do is to find the columns and go ahead and put them as rows 
def rotate(matrix): 
    # define num columns 
    numColumns = len(matrix)
    
    # define columnsToRows
    columnToRows = [[0]*numColumns]*numColumns
    
    # define new matrix 
    for itr in range(0,numColumns):
        emptyList = []
        for element in matrix:
            emptyList.append(element[itr])
        updateRows(columnToRows, emptyList, itr)
        
    # set matrix equal to columnToRows
    for itr in range(0,numColumns):
        matrix[itr] = columnToRows[itr]
    
def main():
    matrix = [[0]*3]*3
    matrix = [
        [1,2,3],
        [4,5,6],
        [7,8,9]
    ]
    rotate(matrix)
    print(matrix)

main()