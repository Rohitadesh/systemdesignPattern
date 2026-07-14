class Printer:
    def print_document(self,text):
        print(f"Printing:{text}")


class Employee:
    def print_report(self,printer):
        printer.print_document("Monthly Report")


printer=Printer()
emp=Employee()
emp.print_report(printer)