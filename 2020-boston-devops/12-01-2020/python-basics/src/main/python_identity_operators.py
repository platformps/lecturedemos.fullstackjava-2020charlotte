# Created by Leon Hunter at 3:21 PM 11/30/2020

firstPhrase = 'The quickest of the brown foxes'
secondPhrase = 'The quickest of the brown foxe'
thirdPhrase = secondPhrase
firstPhraseIsSecondPhrase = firstPhrase is secondPhrase
secondPhraseIsThirdPhrase = secondPhrase is thirdPhrase
secondPhraseIsNotThirdPhrase = secondPhrase is not thirdPhrase

firstPhraseMemoryLocation = id(firstPhrase)
secondPhraseMemoryLocation = id(secondPhrase)
thirdPhraseMemoryLocation = id(thirdPhrase)

print("firstPhraseMemoryLocation = {} ".format(firstPhraseMemoryLocation))
print("secondPhraseMemoryLocation = {} ".format(secondPhraseMemoryLocation))
print("thirdPhraseMemoryLocation = {} ".format(thirdPhraseMemoryLocation))
print("firstPhraseIsSecondPhrase = {} ".format(firstPhraseIsSecondPhrase))
print("secondPhraseIsThirdPhrase = {} ".format(secondPhraseIsThirdPhrase))
print("secondPhraseIsNotThirdPhrase = {} ".format(secondPhraseIsNotThirdPhrase))
