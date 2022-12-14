/////////////////////////////// EXAM FILE HEADER ///////////////////////////////
// Full Name: Peiran LI
// Campus ID: 908 402 6146
// WiscEmail: pli258@wisc.edu
////////////////////////////////////////////////////////////////////////////////

/**
 * AnimalArray implements methods which store and get animal
 * names to and from an array of strings.
 *
 * TODO: Complete the implementation of the two methods below:
 *   - insertAnimal()
 *   - getAnimalNames()
 */
public class AnimalArray {
  /**
   * Inserts a new animal to the next (smallest) unused index
   * within the provided animals array.
   *
   * @param animalName - the name of the new animal being added
   * @param animals - an array storing animal names.
   * @return true when the animal's name is added to the array
   *         false when animalName cannot be added to the array,
   *         because it is already full
   */
  public static boolean insertAnimal(String animalName, String[] animals) {
    if (animals == null || animalName == null || animals[animals.length - 1] != null) {
      return false;
    }

    int availableIndex = 0;
    for (int i = 0; i < animals.length; i++) {
      if (animals[i] == null) {
        availableIndex = i;
        break;
      }
    }

    animals[availableIndex] = animalName;

    return true;
  }

  /**
   * Returns a comma separated string containing the names of every
   * animal in the provided array animals, in the order that they
   * were inserted in the array.
   *
   * animals - an array storing animal names.
   * @return - string containing names of animals held in the array
   *           returns an empty string if the array is empty
   */
  public static String getAnimalNames(String[] animals) {
    String results = "";

    for (int i = 0; i < animals.length; i++) {
      if (animals[i] != null) {
        results += animals[i] + ", ";
      }
    }

    return results;
  }

  /**
   * Tests whether animals added to a given array of animals are
   * returned by getAnimalNames method in the correct format and
   * expected order.
   *
   * @return - true when this test passes, and false otherwise
   */
  private static boolean testAnimalArray() {
    String[] animalNames = new String[100];
    insertAnimal("Alligator", animalNames);
    insertAnimal("Beaver", animalNames);
    insertAnimal("Cheetah", animalNames);
    insertAnimal("Dog", animalNames);
    insertAnimal("Elephant", animalNames);
    insertAnimal("Fish", animalNames);

    String expected = "Alligator, Beaver, Cheetah, Dog, Elephant, Fish";
    if(!getAnimalNames(animalNames).contains(expected)) return false;
    return true;
  }

}
