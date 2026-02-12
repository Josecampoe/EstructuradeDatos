class ArrayWorkshop:

    def __init__(self):
        # One-dimensional list (teams)
        self.teams = ["Barcelona", "Real Madrid", "Atletico Madrid", "Sevilla", "Valencia"]

        # Two-dimensional list (3x3 colors)
        self.colors = [
            ["Red", "Blue", "Green"],
            ["Yellow", "Black", "White"],
            ["Purple", "Orange", "Gray"]
        ]

    # Access elements
    def access_elements(self):
        print("Second team:", self.teams[1])
        print("Color in second row, second column:", self.colors[1][1])

    # Insert and delete
    def insert_delete(self):
        # Insert at position 3 (index 2)
        self.teams.insert(2, "Data Structures")
        print("Teams after insertion:", self.teams)

        # Delete third row and third column
        for row in self.colors:
            row.pop(2)  # removes third column

        self.colors.pop(2)  # removes third row

        print("Color matrix after deletion:")
        for row in self.colors:
            print(row)

    # Search elements
    def search_elements(self):
        index = self.teams.index("Data Structures")
        print("Index of 'Data Structures':", index)

        # Search for a preferred color in the second row
        color_to_search = "Black"
        color_index = self.colors[1].index(color_to_search)
        print(f"Index of '{color_to_search}' in the second row:", color_index)


# Create object
workshop = ArrayWorkshop()

print("----- Access -----")
workshop.access_elements()

print("\n----- Insert and Delete -----")
workshop.insert_delete()

print("\n----- Search -----")
workshop.search_elements()
